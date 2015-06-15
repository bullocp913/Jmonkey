package jme3test.helloworld;
 
import com.jme3.app.SimpleApplication;
import com.jme3.font.BitmapText;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import java.util.logging.{Logger,Level}



object HelloAssets extends SimpleApplication with App {
  @Override
  def simpleInitApp {
    val teapot = assetManager.loadModel("Models/Teapot/Teapot.obj")
    val mat_default = new Material(assetManager, 
      "Common/MatDefs/Misc/ShowNormals.j3md")
    teapot.setMaterial(mat_default)
    rootNode.attachChild(teapot)

    val box = new Box(2.5f,2.5f,1.0f)
    val wall = new Geometry("Box", box)
    val mat_brick = new Material(assetManager,
      "Common/MatDefs/Misc/Unshaded.j3md")
    mat_brick.setTexture("ColorMap",
      assetManager.loadTexture("Textures/Terrain/BrickWall/BrickWall.jpg"))
    wall.setMaterial(mat_brick)
    wall.setLocalTranslation(2.0f,-2.5f,0.0f)
    rootNode.attachChild(wall)

    guiNode.detachAllChildren
    val guiFont = assetManager.loadFont("Interface/Fonts/Default.fnt")
    val helloText = new BitmapText(guiFont, false)
    helloText.setSize(guiFont.getCharSet.getRenderedSize)
    helloText.setText("Hello World")
    helloText.setLocalTranslation(300, helloText.getLineHeight, 0)

    val ninja = assetManager.loadModel("Models/Ninja/Ninja.mesh.xml")
    ninja.scale(0.05f, 0.05f, 0.05f)
    ninja.rotate(0.0f, -3.0f, 0.0f)
    ninja.setLocalTranslation(0.0f, -5.0f, -2.0f)
    rootNode.attachChild(ninja)

    val sun = new DirectionalLight
    sun.setDirection(new Vector3f(-0.1f, -0.7f, -1.0f))
    rootNode.addLight(sun)
  }
  Logger.getLogger("").setLevel(Level.WARNING)
  HelloAssets.start
}