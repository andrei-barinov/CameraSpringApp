public class Camera {

    private CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }


    public CameraRoll getCameraRoll(){
        return cameraRoll;
    }


    public void doPhotograph(){
        System.out.println("Шёлк!");
        cameraRoll.processing();
    }
}
