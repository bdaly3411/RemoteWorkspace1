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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}