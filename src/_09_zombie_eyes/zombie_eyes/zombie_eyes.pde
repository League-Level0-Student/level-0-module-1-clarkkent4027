
void setup() {
  size(900, 900);
PImage face = loadImage("photo2.jpg");
image(face, 0, 0);
}
void draw() {
fill(mouseX, mouseY, mouseY);
ellipse(450, 250, 100, 100);
fill(mouseY, mouseX, mouseX);
ellipse(625, 375, 100, 100);


}
