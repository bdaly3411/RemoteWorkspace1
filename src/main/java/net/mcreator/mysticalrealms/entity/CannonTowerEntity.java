
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
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@MysticalrealmsModElements.ModElement.Tag
public class CannonTowerEntity extends MysticalrealmsModElements.ModElement {
	public static EntityType entity = null;
	public CannonTowerEntity(MysticalrealmsModElements instance) {
		super(instance, 112);
		FMLJavaModLoadingContext.get().getModEventBus().register(new ModelRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("cannon_tower")
						.setRegistryName("cannon_tower");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -1, -1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("cannon_tower_spawn_egg"));
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
				return new MobRenderer(renderManager, new Modelcannontower(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("mysticalrealms:textures/cannontower.png");
					}
				};
			});
		}
	}
	private void setupAttributes() {
		AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
		ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
		ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 40);
		ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
		ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);
		GlobalEntityTypeAttributes.put(entity, ammma.create());
	}
	public static class CustomEntity extends CreatureEntity {
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
	public static class Modelcannontower extends EntityModel<Entity> {
		private final ModelRenderer Leg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Leg2;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer Leg3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer Leg4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer Base;
		public Modelcannontower() {
			textureWidth = 64;
			textureHeight = 64;
			Leg = new ModelRenderer(this);
			Leg.setRotationPoint(0.0F, 24.0F, 0.0F);
			Leg.setTextureOffset(36, 6).addBox(0.0F, -0.7373F, 6.9256F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(1.0F, 0.0F, 7.25F);
			Leg.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.6196F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(4, 7).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Leg2 = new ModelRenderer(this);
			Leg2.setRotationPoint(0.5F, 23.2132F, -7.5904F);
			setRotationAngle(Leg2, -0.8727F, 0.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(2.75F, 1.142F, -0.5908F);
			Leg2.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.8727F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(15, 36).addBox(-3.25F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -0.8502F, 0.1776F);
			Leg2.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 7).addBox(-0.5F, -1.7048F, -0.6434F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Leg3 = new ModelRenderer(this);
			Leg3.setRotationPoint(0.0F, 24.0F, 0.0F);
			Leg3.setTextureOffset(11, 36).addBox(7.0692F, -0.3236F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(7.25F, 0.25F, -0.5F);
			Leg3.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.6109F, 1.5708F, 0.0F);
			cube_r4.setTextureOffset(6, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Leg4 = new ModelRenderer(this);
			Leg4.setRotationPoint(0.0F, 24.0F, 0.0F);
			Leg4.setTextureOffset(4, 36).addBox(-8.0692F, -0.3236F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-7.25F, 0.25F, 0.5F);
			Leg4.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.6109F, -1.5708F, 0.0F);
			cube_r5.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Base = new ModelRenderer(this);
			Base.setRotationPoint(0.0F, 24.0F, 0.0F);
			Base.setTextureOffset(22, 33).addBox(-5.0F, -3.0F, 5.25F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 36).addBox(4.75F, -3.0F, 4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(22, 35).addBox(-5.5F, -3.0F, 4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(4, 34).addBox(-5.5F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(34, 35).addBox(5.25F, -3.0F, 4.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(15, 34).addBox(-6.0F, -3.0F, 4.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(11, 34).addBox(-6.0F, -3.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 30).addBox(-6.0F, -3.0F, -4.5F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			Base.setTextureOffset(22, 31).addBox(-5.0F, -3.0F, -6.5F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(30, 35).addBox(5.25F, -3.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(11, 31).addBox(5.25F, -3.0F, -4.5F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			Base.setTextureOffset(0, 0).addBox(-5.25F, -3.0F, -5.5F, 11.0F, 1.0F, 11.0F, 0.0F, false);
			Base.setTextureOffset(33, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Base.setTextureOffset(27, 19).addBox(-7.0F, -4.25F, -0.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(27, 13).addBox(-7.0F, -4.5F, 0.75F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(27, 27).addBox(-7.0F, -5.0F, 1.75F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 26).addBox(-7.0F, -5.5F, 2.5F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 22).addBox(-7.0F, -7.0F, 2.75F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 18).addBox(-7.0F, -5.5F, -3.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 20).addBox(-7.0F, -7.5F, 2.5F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 12).addBox(-7.0F, -7.5F, -3.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 24).addBox(-7.0F, -6.0F, 2.75F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 16).addBox(-7.0F, -6.0F, -3.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 34).addBox(-7.75F, -6.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(33, 9).addBox(-7.75F, -7.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(33, 7).addBox(-7.75F, -7.75F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(33, 5).addBox(-7.75F, -8.0F, 0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(33, 2).addBox(-7.75F, -8.25F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(33, 0).addBox(-7.75F, -8.0F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(15, 32).addBox(-7.75F, -7.75F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(11, 32).addBox(-7.75F, -7.25F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(4, 32).addBox(-7.75F, -6.25F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 32).addBox(-7.75F, -5.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(15, 30).addBox(-7.75F, -5.25F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(11, 30).addBox(-7.75F, -5.0F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(4, 30).addBox(-7.75F, -5.25F, 0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 30).addBox(-7.75F, -5.5F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 0).addBox(-7.75F, -7.75F, -1.75F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			Base.setTextureOffset(0, 14).addBox(-7.0F, -7.0F, -3.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(27, 17).addBox(-7.0F, -4.5F, -1.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(27, 15).addBox(-7.0F, -5.0F, -2.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(27, 29).addBox(-7.0F, -8.5F, 1.75F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(0, 28).addBox(-7.0F, -9.0F, 0.75F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(27, 25).addBox(-7.0F, -9.25F, -0.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(27, 23).addBox(-7.0F, -9.0F, -1.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(27, 21).addBox(-7.0F, -8.5F, -2.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Base.setTextureOffset(26, 35).addBox(4.75F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			Leg3.render(matrixStack, buffer, packedLight, packedOverlay);
			Leg4.render(matrixStack, buffer, packedLight, packedOverlay);
			Base.render(matrixStack, buffer, packedLight, packedOverlay);
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
