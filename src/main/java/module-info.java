module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires jid3lib;
    requires javafx.media;

    exports mk.mp3player.main;
    opens mk.mp3player.controller;
    opens mk.mp3player.mp3 ;
}