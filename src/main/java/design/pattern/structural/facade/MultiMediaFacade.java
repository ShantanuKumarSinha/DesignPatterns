package design.pattern.structural.facade;

public class MultiMediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private ImageLoader imageLoader;

    public MultiMediaFacade() {
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
        imageLoader = new ImageLoader();
    }

    public void play(String filename, MediaType mediaType) {
        switch (mediaType) {
            case IMAGE:
                imageLoader.loadImage(filename);
                break;
            case VIDEO:
                videoPlayer.playVideo(filename);
                break;
            case AUDIO:
                audioPlayer.playAudio(filename);
                break;
            default:
                throw new IllegalArgumentException("Unsupported media type: " + mediaType);
        }
    }

}
