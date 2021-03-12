
package net.mcreator.mysticalrealms.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@MysticalrealmsModElements.ModElement.Tag
public class ArcherTowerEntity extends MysticalrealmsModElements.ModElement {
	public static EntityType entity = null;
	public ArcherTowerEntity(MysticalrealmsModElements instance) {
		super(instance, 113);
		FMLJavaModLoadingContext.get().getModEventBus().register(new ModelRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("archer_tower")
						.setRegistryName("archer_tower");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -1, -1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("archer_tower_spawn_egg"));
	}

	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(entity, 20, 4, 4));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(this::setupAttributes);
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawn);
	}
	private static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelarchertower(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("mysticalrealms:textures/archertower.png");
					}
				};
			});
		}
	}
	private void setupAttributes() {
		AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
		ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
		ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 10);
		ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
		ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);
		GlobalEntityTypeAttributes.put(entity, ammma.create());
	}
	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}
	}

	// Made with Blockbench 3.7.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelarchertower extends EntityModel<Entity> {
		private final ModelRenderer Base;
		private final ModelRenderer Legs;
		private final ModelRenderer Ladder;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer Supportbeams;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		public Modelarchertower() {
			textureWidth = 128;
			textureHeight = 128;
			Base = new ModelRenderer(this);
			Base.setRotationPoint(8.0F, 12.0F, -8.0F);
			Base.setTextureOffset(0, 0).addBox(-17.0F, -1.0F, -1.0F, 18.0F, 1.0F, 18.0F, 0.0F, false);
			Legs = new ModelRenderer(this);
			Legs.setRotationPoint(0.0F, 24.0F, 0.0F);
			Legs.setTextureOffset(0, 33).addBox(-8.0F, -12.0F, -8.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			Legs.setTextureOffset(29, 32).addBox(-8.0F, -12.0F, 7.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			Legs.setTextureOffset(12, 0).addBox(7.0F, -12.0F, 7.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			Legs.setTextureOffset(8, 0).addBox(7.0F, -12.0F, -8.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			Ladder = new ModelRenderer(this);
			Ladder.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-8.25F, -12.25F, 1.25F);
			Ladder.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
			cube_r1.setTextureOffset(8, 13).addBox(-0.5F, 3.5F, -3.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-9.25F, -9.25F, 1.25F);
			Ladder.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3054F);
			cube_r2.setTextureOffset(30, 25).addBox(-0.5F, 3.5F, -3.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-10.25F, -6.25F, 1.25F);
			Ladder.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3054F);
			cube_r3.setTextureOffset(4, 33).addBox(-0.5F, 3.5F, -3.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-10.25F, -6.5F, -2.25F);
			Ladder.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3054F);
			cube_r4.setTextureOffset(0, 0).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(4, 4).addBox(-0.5F, -6.5F, 4.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
			Supportbeams = new ModelRenderer(this);
			Supportbeams.setRotationPoint(0.0F, 24.0F, 0.0F);
			Supportbeams.setTextureOffset(0, 31).addBox(-7.0F, -4.25F, 7.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			Supportbeams.setTextureOffset(29, 30).addBox(-7.0F, -4.25F, -8.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(1.75F, -7.0F, -7.5F);
			Supportbeams.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.5672F);
			cube_r5.setTextureOffset(0, 23).addBox(-10.0F, -0.5F, -0.5F, 16.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 27).addBox(-10.0F, -0.5F, 14.5F, 16.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(1.75F, -9.0F, 7.5F);
			Supportbeams.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, -0.5672F);
			cube_r6.setTextureOffset(0, 21).addBox(-10.0F, -0.5F, -0.5F, 16.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 25).addBox(-10.0F, -0.5F, -15.5F, 16.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(7.5F, -7.0F, 1.0F);
			Supportbeams.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, -1.9635F, 1.5708F);
			cube_r7.setTextureOffset(0, 19).addBox(-9.0F, -0.5F, -0.5F, 16.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-7.5F, -3.75F, 0.0F);
			Supportbeams.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, -1.5708F, 0.0F);
			cube_r8.setTextureOffset(0, 29).addBox(-7.0F, -0.5F, -0.5F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Base.render(matrixStack, buffer, packedLight, packedOverlay);
			Legs.render(matrixStack, buffer, packedLight, packedOverlay);
			Ladder.render(matrixStack, buffer, packedLight, packedOverlay);
			Supportbeams.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
