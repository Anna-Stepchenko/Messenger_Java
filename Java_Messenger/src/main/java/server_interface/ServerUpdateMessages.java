package server_interface;

import java.util.TimerTask;

public class ServerUpdateMessages extends TimerTask {
    ServerApplication application;
    public ServerUpdateMessages(ServerApplication application) {
        this.application = application;
    }

    @Override
    public void run() {
        ServerUtility.messagesUpdate(application);
        application.getPane().setText(application.messagesToStringAndFilter(application.getSelectedUser()));
    }
}

