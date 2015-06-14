import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.math.ColorRGBA;

object test extends SimpleApplication with App {
    @Override
    def simpleInitApp {
        val b = new Box(1,1,1)
        val g = new Geometry("Box",b)
        val m = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md")
        m.setColor("Color", ColorRGBA.Blue)
        g.setMaterial(m)
        rootNode.attachChild(g)
    }
    
    test.start
}