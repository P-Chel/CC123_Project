package gui;

import constant.commonconstant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HowToAppointment extends homepage {
    private String loggedInLastName;
    private String loggedInFirstName;
    private String loggedInMiddleName;
    private int age;
    private int number;
    private String address;
    private int id;
    private String sex;
    private String email;

    public HowToAppointment() {
        super("AppointmentTutorial");
        addTutorialGUI();
    }

    private void addTutorialGUI() {
        JPanel tutorialPanel = new JPanel();
        tutorialPanel.setLayout(null);
        tutorialPanel.setBounds(0,0, 1300, 900);

        ImageIcon logoIcon = new ImageIcon("appoinment/src/image/434024649_1363976920953749_3166889348485858378_n.png"); // Replace "path_to_your_logo_image_file.jpg" with the actual path to your image file

        // Create a JLabel to display the logo image
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(-10, 45, 180, 100); // Adjust the position and size as needed

        add(logoLabel);

        JLabel menulabel = new JLabel("Health");

        menulabel.setBounds(0, 53, 400, 100);
        menulabel.setForeground(commonconstant.HOME_BG1_BLUE);

        menulabel.setFont(new Font("Dialog", Font.BOLD, 20));

        menulabel.setHorizontalAlignment(SwingConstants.CENTER);


        JLabel menulabel2 = new JLabel("Appointment");

        menulabel2.setBounds(91, 53, 400, 100);
        menulabel2.setForeground(commonconstant.TEXT_COLOR);

        menulabel2.setFont(new Font("Dialog", Font.BOLD, 20));

        menulabel2.setHorizontalAlignment(SwingConstants.CENTER);



        //new time menu for the time selection mode

        JButton home = new JButton("Home");
        home.setFont(new Font("Dialog", Font.BOLD, 20));
        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        home.setBounds(555, 91, 100, 25);
        home.setForeground(commonconstant.TEXT_COLOR);
        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HowToAppointment.this.dispose();


                new home(id, loggedInLastName, loggedInFirstName, loggedInMiddleName, sex, age, number, email, address).setVisible(true);

            }
        });

        //reserved space for database


        JButton about= new JButton("About Us");
        about.setFont(new Font("Dialog", Font.BOLD, 20));

        about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        about.setForeground(commonconstant.TEXT_COLOR);
        //set mouse listener
        about.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HowToAppointment.this.dispose();
                new About().setVisible(true);
            }

        });

        about.setBounds(655, 91, 160,25);

        JButton ContactUs= new JButton("Contact Us");
        ContactUs.setFont(new Font("Dialog", Font.BOLD, 20));

        ContactUs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ContactUs.setForeground(commonconstant.TEXT_COLOR);
        //set mouse listener
        ContactUs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                HowToAppointment.this.dispose();
                new ContactUs().setVisible(true);

            }
        });

        ContactUs.setBounds(800, 91, 200,25);

        // new edit nothing button

        JButton nothing = new JButton("");
        nothing.setBounds(0, 0, 0, 0);
        nothing.setForeground(new Color(0, 0, 0, 0));
        nothing.setBackground(new Color(0, 0, 0, 0));
        nothing.setFont(new Font("Dialog", Font.BOLD, 0));

        nothing.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //set mouse listener
        nothing.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HowToAppointment.this.dispose();

                new loginpage().setVisible(true);

            }
        });


        JButton signin= new JButton("Logout");
        signin.setFont(new Font("Dialog", Font.BOLD, 18));

        signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signin.setForeground(commonconstant.TEXT_COLOR);
        signin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                HowToAppointment.this.dispose();
                new loginpage().setVisible(true);
            }
        });

        signin.setBounds(1000, 91, 150,25);


        add(nothing); // new edit
        add(menulabel);
        add(menulabel2);
        add(signin);
        add(about);
        add(home);
        add(ContactUs);

        JLabel txtHow = new JLabel("HOW TO BOOK AN APPOINTMENT");
        txtHow.setFont(new Font("Dialogs", Font.BOLD, 30));
        txtHow.setBounds(310, 230, 700, 50);
        txtHow.setForeground(commonconstant.TEXT_COLOR);

        JPanel BGlightblue = new JPanel(null);
        BGlightblue.setBounds(100,190,1000,550);
        BGlightblue.setBackground(commonconstant.HOME_BG1_GRAY);

        // image for steps
        ImageIcon T1 = new ImageIcon ("appoinment/src/image/t1.png");
        JLabel step1 = new JLabel(T1);
        step1.setBounds(0, 50, 300, 300);

        ImageIcon T2 = new ImageIcon ("appoinment/src/image/step-2.png");
        JLabel step2 = new JLabel(T2);
        step2.setBounds(330, 50, 300, 300);

        ImageIcon T3 = new ImageIcon ("appoinment/src/image/step 3.png");
        JLabel step3 = new JLabel(T3);
        step3.setBounds(650, 50, 300, 300);


        //text for steps
        JLabel txtT1 = new JLabel("After logging in, click \"Book now\"");
        txtT1.setFont(new Font("Dialogs", Font.BOLD, 17));
        txtT1.setBounds(17, 280, 700, 50);
        txtT1.setForeground(commonconstant.TEXT_COLOR);

        JLabel txtT2 = new JLabel("After clicking \"Book now\"press");
        txtT2.setFont(new Font("Dialogs", Font.BOLD, 17));
        txtT2.setBounds(330, 280, 700, 50);
        txtT2.setForeground(commonconstant.TEXT_COLOR);

        JLabel txtTv2 = new JLabel("\"consult now\" to the doctor that");
        txtTv2.setFont(new Font("Dialogs", Font.BOLD, 17));
        txtTv2.setBounds(330, 300, 700, 50);
        txtTv2.setForeground(commonconstant.TEXT_COLOR);

        JLabel txtTv3 = new JLabel("has the appointment that you want");
        txtTv3.setFont(new Font("Dialogs", Font.BOLD, 17));
        txtTv3.setBounds(330, 320, 700, 50);
        txtTv3.setForeground(commonconstant.TEXT_COLOR);

        JLabel txtT3 = new JLabel("This will be shown after clicking");
        txtT3.setFont(new Font("Dialogs", Font.BOLD, 17));
        txtT3.setBounds(680, 280, 700, 50);
        txtT3.setForeground(commonconstant.TEXT_COLOR);

        JLabel txtTw3 = new JLabel("\"consult now\" and all you have to");
        txtTw3.setFont(new Font("Dialogs", Font.BOLD, 17));
        txtTw3.setBounds(680, 300, 700, 50);
        txtTw3.setForeground(commonconstant.TEXT_COLOR);

        JLabel txtTq3 = new JLabel("do is fill up the form then submit");
        txtTq3.setFont(new Font("Dialogs", Font.BOLD, 17));
        txtTq3.setBounds(680, 320, 700, 50);
        txtTq3.setForeground(commonconstant.TEXT_COLOR);

        ImageIcon bgBlue = new ImageIcon ("appoinment/src/image/BGlikodIMG.jpg");
        JLabel bgBluePic = new JLabel(bgBlue);
        bgBluePic.setBounds(0, 165, 1300, 650);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        JLabel panelLabel = new JLabel();
        panel1.add(panelLabel, BorderLayout.CENTER);
        panel1.setBounds(0, 0, 1300, 150);



        add(panel1); // white panel above
        BGlightblue.add(step3);
        BGlightblue.add(step2);
        BGlightblue.add(txtTw3);
        BGlightblue.add(txtTq3);
        BGlightblue.add(txtTv3);
        BGlightblue.add(txtT3);
        BGlightblue.add(txtT2);
        BGlightblue.add(txtTv2);
        BGlightblue.add(txtT1);
        BGlightblue.add(step1);
        tutorialPanel.add(txtHow);
        tutorialPanel.add(BGlightblue);
        tutorialPanel.add(bgBluePic);
        add(tutorialPanel);







    }


    }
