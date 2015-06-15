import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Node;

object tutorial2 extends SimpleApplication with App {
    @Override
    def simpleInitApp {
        val box1 = new Box(1,1,1)
        val g = new Geometry("Box",box1)
        val m = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md")

        g.setLocalTranslation(new Vector3f(1,-1,1))
        m.setColor("Color", ColorRGBA.Blue)
        g.setMaterial(m)

        val box2 = new Box(1,1,1)
        val g2 = new Geometry("Box", box2)
        val mat2 = new Material(assetManager,"Common/MatDefs/Misc/Unshaded.j3md")

        g2.setLocalTranslation(new Vector3f(1,3,1))
        mat2.setColor("Color", ColorRGBA.Red)
        g2.setMaterial(mat2)

        val pivot = new Node("pivot")
        rootNode.attachChild(pivot)

        pivot.attachChild(g)
        pivot.attachChild(g2)

        pivot.rotate(.4f,.4f,0f)
    }
    
    tutorial2.start
}
