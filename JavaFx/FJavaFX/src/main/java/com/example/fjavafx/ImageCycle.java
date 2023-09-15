import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ImageCycle extends Application {

    private ImageView imageView;
    private Button playPauseButton;
    private Button speedUpButton;
    private Button slowDownButton;
    private int currentImageIndex = 0;
    private Image[] images = {
            new Image("image1.jpg"),
            new Image("image2.jpg"),
            new Image("image3.jpg")
    };
    private boolean isPlaying = true;
    private int animationSpeed = 2000; // 2 seconds
    private Timeline animation;

    @Override
    public void start(Stage primaryStage) {
        imageView = new ImageView(images[currentImageIndex]);
        playPauseButton = new Button("Pause");
        speedUpButton = new Button("Speed+");
        slowDownButton = new Button("Speed-");

        playPauseButton.setOnAction(event -> {
            if (isPlaying) {
                animation.pause();
                playPauseButton.setText("Play");
            } else {
                animation.play();
                playPauseButton.setText("Pause");
            }
            isPlaying = !isPlaying;
        });

        speedUpButton.setOnAction(event -> {
            animationSpeed = animationSpeed / 2;
            animation.stop();
            animation.getKeyFrames().clear();
            setupAnimation();
            if (isPlaying) {
                animation.play();
            }
        });

        slowDownButton.setOnAction(event -> {
            animationSpeed = animationSpeed * 2;
            animation.stop();
            animation.getKeyFrames().clear();
            setupAnimation();
            if (isPlaying) {
                animation.play();
            }
        });

        HBox buttonBox = new HBox(playPauseButton, speedUpButton, slowDownButton);
        BorderPane root = new BorderPane();
        root.setCenter(imageView);
        root.setBottom(buttonBox);

        animation = new Timeline(new KeyFrame(Duration.millis(animationSpeed), event -> {
            currentImageIndex = (currentImageIndex + 1) % images.length;
            imageView.setImage(images[currentImageIndex]);
        }));
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    private void setupAnimation() {
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(animationSpeed), event -> {
            currentImageIndex = (currentImageIndex + 1) % images.length;
            imageView.setImage(images[currentImageIndex]);
        }));
        animation.setCycleCount(Animation.INDEFINITE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
