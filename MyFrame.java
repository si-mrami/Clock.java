package com.company;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    ImageIcon icon;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MyClock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 260);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("clock.jpg");



        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("verdana", Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00ff00));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink free", Font.PLAIN, 40));
        dayLabel.setForeground(new Color(0-204-0));
        dayLabel.setBackground(Color.BLACK);
        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink free", Font.PLAIN, 40));
        dateLabel.setForeground(new Color(255-0-0));
        dateLabel.setBackground(Color.LIGHT_GRAY);
        dateLabel.setOpaque(true);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

      setTime();

    }
    public void setTime(){
              while(true) {
                  time = timeFormat.format(Calendar.getInstance().getTime());
                  timeLabel.setText(time);

                  day = dayFormat.format(Calendar.getInstance().getTime());
                  dayLabel.setText(day);

                  date = dateFormat.format(Calendar.getInstance().getTime());
                  dateLabel.setText(date);
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {

                  }
              }
            }

        }


