package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.BankConnection;
import view.WelcomeScreen;

public class WelcomeScreenController implements EventHandler<ActionEvent>
{
    private BankConnection bankConnection;
    private WelcomeScreen view;

    public WelcomeScreenController(WelcomeScreen view)
    {
        this.view = view;
    }

    public WelcomeScreenController(BankConnection bankConnection, WelcomeScreen view)
    {
        this.bankConnection = new BankConnection();
        this.view = new WelcomeScreen();
    }

    public void handle(ActionEvent event)
    {
        if(event.getSource() == view.getAccessAccountButton()) view.setScene(view.getAccessAccountScene());
        if(event.getSource() == view.getCreateAccountButton()) view.setScene(view.getCreateAccountScene());
        if(event.getSource() == view.getDeleteAccountButton()) view.setScene(view.getDeleteAccountScene());
    }
}
