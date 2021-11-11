public class Client {

    public static void main(String[] args) {

        /* данный код рабочий ! */

        /*
        Camera camera_ = new Camera();
        CameraRoll ColorCameraRoll = new ColorCameraRoll();
        CameraRoll BlackAndWhiteCameraRoll = new BlackAndWhiteCameraRoll();

        camera_.setCameraRoll(ColorCameraRoll);
        camera_.doPhotograph();


         */


        Assistant assistant = new Assistant();
        Camera camera = assistant.getCamera();
        camera.doPhotograph();

    }
}
