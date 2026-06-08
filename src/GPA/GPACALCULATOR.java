 package GPA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class GPACALCULATOR extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4; // GPA
	private JTextField textField_5; // Performance
	private JTable table;
	private JTextArea textArea;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GPACALCULATOR frame = new GPACALCULATOR();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GPACALCULATOR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(50, 51, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Student Academic Performance Analyzer");
		lblNewLabel.setBounds(183, 10, 201, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(171, 48, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Student_ID");
		lblNewLabel_2.setBounds(51, 91, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 88, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Department");
		lblNewLabel_3.setBounds(50, 136, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(171, 132, 96, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Semester");
		lblNewLabel_4.setBounds(51, 178, 48, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(171, 178, 96, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Grading");
		lblNewLabel_5.setBounds(51, 219, 48, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Relative");
		rdbtnNewRadioButton.setBounds(171, 215, 110, 22);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Absolute");
		rdbtnNewRadioButton_1.setBounds(314, 215, 110, 22);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Courses");
		lblNewLabel_6.setBounds(51, 250, 48, 14);
		contentPane.add(lblNewLabel_6);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("OOP");
		chckbxNewCheckBox.setBounds(169, 246, 98, 22);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Web Engineering");
		chckbxNewCheckBox_1.setBounds(297, 246, 127, 22);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("AI");
		chckbxNewCheckBox_2.setBounds(169, 287, 98, 22);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("DBMS");
		chckbxNewCheckBox_3.setBounds(297, 287, 98, 22);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("DSA");
		chckbxNewCheckBox_4.setBounds(397, 287, 98, 22);
		contentPane.add(chckbxNewCheckBox_4);
		
		JLabel lblNewLabel_7 = new JLabel("Subject name");
		lblNewLabel_7.setBounds(50, 323, 74, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(171, 320, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Credit Hour");
		lblNewLabel_8.setBounds(51, 368, 73, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(171, 365, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		// Grade
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setBounds(314, 323, 49, 14);
		contentPane.add(lblGrade);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(397, 319, 96, 22);
		comboBox_2.addItem("A");
		comboBox_2.addItem("A-");
		comboBox_2.addItem("B+");
		comboBox_2.addItem("B");
		comboBox_2.addItem("C+");
		comboBox_2.addItem("C");
		comboBox_2.addItem("D");
		comboBox_2.addItem("F");
		contentPane.add(comboBox_2);

		// Radio Button Group
		ButtonGroup gradingGroup = new ButtonGroup();
		gradingGroup.add(rdbtnNewRadioButton);
		gradingGroup.add(rdbtnNewRadioButton_1);

		// Department Data
		comboBox.addItem("BSSE");
		comboBox.addItem("BSCS");
		comboBox.addItem("BSIT");
		comboBox.addItem("BSAI");

		// Semester Data
		for(int i = 1; i <= 8; i++)
		{
			comboBox_1.addItem(i + " Semester");
		}

		// Buttons
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.setBounds(314, 364, 120, 23);
		contentPane.add(btnAddCourse);

		btnAddCourse.addActionListener(e -> {

		    try {
		        String subject = textField_2.getText().trim();
		        String credit = textField_3.getText().trim();
		        String grade = comboBox_2.getSelectedItem().toString();

		        if(subject.isEmpty()) {
		            JOptionPane.showMessageDialog(this,"Enter Subject Name");
		            return;
		        }

		        if(credit.isEmpty()) {
		            JOptionPane.showMessageDialog(this,"Enter Credit Hours");
		            return;
		        }

		        Integer.parseInt(credit);

		        model.addRow(new Object[]{
		                subject,
		                credit,
		                grade
		        });

		        textField_2.setText("");
		        textField_3.setText("");

		    }
		    catch(Exception ex) {
		        JOptionPane.showMessageDialog(this,
		                ex.getMessage());
		    }

		});
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(445, 364, 100, 23);
		contentPane.add(btnRemove);
		
		btnRemove.addActionListener(e -> {

		    int row = table.getSelectedRow();

		    if(row == -1) {
		        JOptionPane.showMessageDialog(this,
		                "Select a row first");
		    }
		    else {
		        model.removeRow(row);
		    }

		});

		JButton btnCalculate = new JButton("Calculate GPA");
		btnCalculate.setBounds(50, 410, 140, 23);
		contentPane.add(btnCalculate);

		btnCalculate.addActionListener(e -> {

		    try {

		        if(model.getRowCount() == 0) {
		            JOptionPane.showMessageDialog(this,
		                    "Add at least one course");
		            return;
		        }

		        double totalPoints = 0;
		        int totalCredits = 0;

		        for(int i=0;i<model.getRowCount();i++) {

		            int credit = Integer.parseInt(
		                    model.getValueAt(i,1).toString());

		            String grade =
		                    model.getValueAt(i,2).toString();

		            double points =
		                    getGradePoint(grade);

		            totalPoints += points * credit;
		            totalCredits += credit;
		        }

		        double gpa = totalPoints / totalCredits;

		        textField_4.setText(
		                String.format("%.2f",gpa));

		        if(gpa >= 3.5) {
		            textField_5.setText("Excellent");
		            textField_5.setBackground(Color.GREEN);
		        }
		        else if(gpa >= 3.0) {
		            textField_5.setText("Good");
		            textField_5.setBackground(Color.CYAN);
		        }
		        else if(gpa >= 2.0) {
		            textField_5.setText("Average");
		            textField_5.setBackground(Color.YELLOW);
		        }
		        else {
		            textField_5.setText("Poor");
		            textField_5.setBackground(Color.RED);
		        }

		        textArea.setText(
		                "Student Name: " + textField.getText()
		                + "\nStudent ID: " + textField_1.getText()
		                + "\nGPA: " + textField_4.getText()
		                + "\nPerformance: " + textField_5.getText());

		    }
		    catch(Exception ex) {
		        JOptionPane.showMessageDialog(this,
		                ex.getMessage());
		    }

		});
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(210, 410, 100, 23);
		contentPane.add(btnClear);
		
		btnClear.addActionListener(e -> {

		    textField.setText("");
		    textField_1.setText("");
		    textField_2.setText("");
		    textField_3.setText("");
		    textField_4.setText("");
		    textField_5.setText("");

		    model.setRowCount(0);

		    textArea.setText("");

		});

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(334, 410, 100, 23);
		contentPane.add(btnExit);
		
		btnCalculate.setBackground(Color.BLUE);
		btnCalculate.setForeground(Color.WHITE);

		btnClear.setBackground(Color.GREEN);
		btnClear.setForeground(Color.BLACK);

		btnAddCourse.setBackground(Color.GREEN);
		btnAddCourse.setForeground(Color.BLACK);

		btnRemove.setBackground(Color.RED);
		btnRemove.setForeground(Color.WHITE);

		btnExit.setBackground(Color.RED);
		btnExit.setForeground(Color.WHITE);
		
		
		btnExit.addActionListener(e -> {
		    System.exit(0);
		});

		// Increase Frame Size
		setBounds(100, 100, 850, 700);

		// Table
		String[] columns = {
			"Subject",
			"Credit Hours",
			"Grade"
		};

		model = new DefaultTableModel(columns,0);

		table = new JTable(model);

		JScrollPane scrollPane =
				new JScrollPane(table);

		scrollPane.setBounds(50, 450, 500, 120);
		contentPane.add(scrollPane);

		// GPA
		JLabel lblGPA = new JLabel("GPA");
		lblGPA.setBounds(600, 90, 49, 14);
		contentPane.add(lblGPA);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(600, 115, 120, 20);
		contentPane.add(textField_4);

		// Performance
		JLabel lblPerformance = new JLabel("Performance");
		lblPerformance.setBounds(600, 160, 100, 14);
		contentPane.add(lblPerformance);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(600, 185, 120, 20);
		contentPane.add(textField_5);

		// Report
		JLabel lblReport = new JLabel("Report");
		lblReport.setBounds(600, 240, 60, 14);
		contentPane.add(lblReport);

		textArea = new JTextArea();
		textArea.setEditable(false);

		JScrollPane reportScroll =
				new JScrollPane(textArea);

		reportScroll.setBounds(600, 265, 180, 180);
		contentPane.add(reportScroll);
		
	}
	private double getGradePoint(String grade)
	{
	    switch(grade)
	    {
	        case "A": return 4.0;
	        case "A-": return 3.7;
	        case "B+": return 3.3;
	        case "B": return 3.0;
	        case "C+": return 2.3;
	        case "C": return 2.0;
	        case "D": return 1.0;
	        default: return 0.0;
	    }
	}
	
}
