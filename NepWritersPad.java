import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NepWritersPad extends JFrame implements ActionListener {

JMenu file,edit,help,format;
JMenuItem newFile, openFile, saveFile, saveAsFile, printFile, closeFile, QUIT, cut, copy, paste, selectAll, about;
JTextArea txtArea;

    NepWritersPad(){
        setVisible(true);
        setBounds(10,10,1000,700);
        setLayout(null);
        setLocation(500,200);
        setDefaultCloseOperation(NepWritersPad.EXIT_ON_CLOSE);

        // adding and styling menubar
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File"); // file menu
        // adding items to the menu
         newFile = new JMenuItem("new"); // adding item new for creating new file
        //newFile.setAccelerator(KeyStroke.getKeyStroke());
        file.add(newFile);
        JMenuItem openFile = new JMenuItem("open"); // adding item new for creating new file
        //newFile.setAccelerator(KeyStroke.getKeyStroke());
        file.add(openFile);
        JMenuItem saveFile = new JMenuItem("save"); // adding item new for creating new file
        //newFile.setAccelerator(KeyStroke.getKeyStroke());
        file.add(saveFile);
        JMenuItem saveAsFile = new JMenuItem("save as"); // adding item new for creating new file
        //newFile.setAccelerator(KeyStroke.getKeyStroke());
        file.add(saveAsFile);
        JMenuItem printFile = new JMenuItem("print"); // adding item new for creating new file
        //newFile.setAccelerator(KeyStroke.getKeyStroke());
        file.add(printFile);
        JMenuItem closeFile = new JMenuItem("close"); // adding item new for creating new file
        //newFile.setAccelerator(KeyStroke.getKeyStroke());
        file.add(closeFile);
        QUIT = new JMenuItem("Exit"); // adding item new for creating new file
        //newFile.setAccelerator(KeyStroke.getKeyStroke());
        file.add(QUIT);

        JMenu edit = new JMenu("Edit");
        JMenu format = new JMenu("Format");
        JMenu help = new JMenu("Help");

        // adding the menus to menuBar
        menuBar.add(file);





        menuBar.add(edit);
        // add menu items copy, cut , paste and select all
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        // add menus to menuBar edit
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        menuBar.add(format);
        menuBar.add(help);
        about = new JMenuItem("About NepWritersPad");
        help.add(about);

        setJMenuBar(menuBar); // setting the menu bar to top

        // making a center text
        txtArea = new JTextArea();

        txtArea.setBackground(Color.pink);
        txtArea.setBounds(4,4,1240,960);
        add(txtArea);

        // keep action listener for copy, selectAll, cut, paste events
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        QUIT.addActionListener(this);







    }

     /*
        make copy, cut, paste print work
         */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==selectAll){
            txtArea.selectAll();
        }
        if (e.getSource()==cut){
            txtArea.cut();
        }
        if (e.getSource()==copy){
            txtArea.copy();
        }
        if (e.getSource()==paste){
            txtArea.paste();
        }
        if(e.getSource()==QUIT){
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }


//
 }
