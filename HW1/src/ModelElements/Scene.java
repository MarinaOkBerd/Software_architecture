package ModelElements;

public class Scene {
    int id;
    PoligonalModel models;
    Flash flashes;
    Camera camera;

    public Scene(PoligonalModel models, Flash flashes, Camera camera) {
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }
    
}
