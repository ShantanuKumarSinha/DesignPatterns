package design.pattern.structural.facade;

public class Client {
    public static void main(String[] args) {
        MultiMediaFacade multiMediaFacade = new MultiMediaFacade();
        multiMediaFacade.play("example.jpg", MediaType.IMAGE);
        multiMediaFacade.play("example.mp3", MediaType.AUDIO);
        multiMediaFacade.play("example.mp4", MediaType.VIDEO);
    }
}
