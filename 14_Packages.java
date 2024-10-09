import java.awt.*;

class MyLoginWindow extends Frame {
    MyLoginWindow() {
        TextField name, pass;
        Button b1, b2;

        Label n = new Label("Name:", Label.CENTER);
        Label p = new Label("Password:", Label.CENTER);

        name = new TextField(20);
        pass = new TextField(20);
        pass.setEchoChar('*');

        b1 = new Button("Submit");
        b2 = new Button("Cancel");

        this.setLayout(null);

        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
        this.add(b1);
        this.add(b2);

        n.setBounds(70, 90, 90, 20);
        name.setBounds(200, 90, 90, 20);

        p.setBounds(70, 130, 90, 20);
        pass.setBounds(200, 130, 90, 20);

        b1.setBounds(100, 200, 60, 30);
        b2.setBounds(180, 200, 60, 30);
    }

    public static void main(String[] args) {
        MyLoginWindow m1 = new MyLoginWindow();
        m1.setVisible(true);
        m1.setSize(400, 400);
        m1.setTitle("Login");
    }
}
