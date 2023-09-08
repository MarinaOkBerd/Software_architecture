package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.Poligon;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;
import ModelElements.Utils.Angle3D;
import ModelElements.Utils.Color;
import ModelElements.Utils.Point3D;

public class ModelStore implements IModelChangeObserver, IModelChanger {
public PoligonalModel models;
public Scene scenes;
public Flash flashes;
public Camera cameras;
private IModelChangeObserver changeObserver;

public ModelStore(IModelChangeObserver changeObserver) {
    this.changeObserver = changeObserver;
    this.flashes = new Flash(new Point3D(), new Angle3D(), new Color());
    this.cameras = new Camera(new Point3D(), new Angle3D());
    this.scenes = new Scene(this.models, this.flashes, this.cameras);
    this.models = new PoligonalModel(new Poligon(new Point3D()), new Texture());
}

public Scene getScene(int id) {
    return this.scenes;
}

@Override
public void notifyChange(IModelChanger sender) {
}

@Override
public void applyUpdateModel(){

}
}
