public class Client {

    public static void main(String[] args) {

        /* данный код рабочий !

        Camera camera = new Camera();
        CameraRoll ColorCameraRoll = new ColorCameraRoll();
        CameraRoll BlackAndWhiteCameraRoll = new BlackAndWhiteCameraRoll();

        camera.setCameraRoll(BlackAndWhiteCameraRoll);
        camera.doPhotograph();

         */

        Assistant assistant = new Assistant();
        Camera camera = assistant.getCamera();
        camera.doPhotograph();

    }
}
