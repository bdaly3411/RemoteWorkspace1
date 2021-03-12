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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}