// 경상국립대학교 항공우주및소프트웨어공학전공  2020080165 구건우.
// 본 프로젝트는 2022년도 객체지향프로그래밍 수업을 위한 X-ManagementSystem 실습프로젝트 입니다.
// 본 과제는 본인 고유의 창작물이며, 교제와 명시된 참고문헌과 자료를 제외한 그 어떠한 부정한 방법도 사용되지 않았습니다.
// 최종수정 : 2022.06.08.

package Homework_Management;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Prototype {

 public static void main(String[] args) {
  new HomeworkMangement();
 }

}

class HomeworkMangement extends JFrame implements ActionListener {
 JButton button1 = null;
 JButton button2 = null;
 JButton button3 = null;
 JButton button4 = null;
 JButton button5 = null;
 JTable table = null;

 public HomeworkMangement() {
  super("The Koo's Homework Management System ");
  this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  this.setBounds(600, 600, 800, 500);
  this.setLayout(new FlowLayout());
  

  JPanel panelComboBox = new JPanel();
  JPanel panelList = new JPanel();
  JPanel panelTable = new JPanel();
  JPanel panelNormal = new JPanel();

  panelComboBox.setLayout(new FlowLayout());
  panelList.setLayout(new FlowLayout());
  panelTable.setLayout(new FlowLayout());
  panelNormal.setLayout(new FlowLayout());

  //패널부_1
  String titlefirst[] = new String[3];
  titlefirst[0] = "The Book Names";
  titlefirst[1] = "Major or Not";
  titlefirst[2] = "The Building Location";
  String subdata[][] = new String[0][0];
  

  table = new JTable(subdata, titlefirst);
  JScrollPane scrolpane = new JScrollPane(table);
  scrolpane.setPreferredSize(new Dimension(400, 350));

  panelTable.add(scrolpane);

  //패널부_2
  button1 = new JButton("Subject Enroll");
  button1.addActionListener(this);
  panelNormal.add(button1);

  button2 = new JButton("Subject Delete");
  button2.addActionListener(this);
  panelNormal.add(button2);

  button3 = new JButton("Subject Print");
  button3.addActionListener(this);
  panelNormal.add(button3);

  button4 = new JButton("Homework Enroll");
  button4.addActionListener(this);
  panelNormal.add(button4);

  button5 = new JButton("Homework Print");
  button5.addActionListener(this);
  panelNormal.add(button5);

  // 패널_연결
  this.add(panelComboBox);
  this.add(panelList);
  this.add(panelTable);
  this.add(panelNormal);

  this.setVisible(true);
 }

 public void EnterAfterReTableing() {
  String titleenter[] = new String[3];
  titleenter[0] = "The Book Names";
  titleenter[1] = "Major or Not";
  titleenter[2] = "The Building Location";
  

  int size = SubjectManager.list.size();
  String[][] DataSubjectArray = new String[size][3];

  for (int i = 0; i < size; i++) {
   Sub datasub = SubjectManager.list.get(i);

   DataSubjectArray[i][0] = datasub.thebooknames;
   DataSubjectArray[i][1] = datasub.majorornot;
   DataSubjectArray[i][2] = datasub.location;
  }

  table.setModel(new DefaultTableModel(DataSubjectArray, titleenter));
 }
///////////////SubjectManager(TOP)-SubjectRegisterBox(BOTTOM)에 연결////////////////////
 @Override
 public void actionPerformed(ActionEvent e) {

  if (e.getSource() == button1) {
   new SubjectRegisterBOX();
  }
  if (e.getSource() == button2) {
	  
   if (table.getSelectedRow() == -1) {
   } 
   else {
    int deleteIndex = table.getSelectedRow();

    SubjectManager.list.remove(deleteIndex);
    this.EnterAfterReTableing();
   }
  }
  if (e.getSource() == button3) {
   String titleenter2[] = new String[3];
   titleenter2[0] = "The Book Names";
   titleenter2[1] = "Major or Not";
   titleenter2[2] = "The Building Location";
  

   int size = SubjectManager.list.size();
   String[][] dataStudentArray = new String[size][3];

   for (int i = 0; i < size; i++) {
    Sub dataStudent = SubjectManager.list.get(i);

    dataStudentArray[i][0] = dataStudent.thebooknames;
    dataStudentArray[i][1] = dataStudent.majorornot;
    dataStudentArray[i][2] = dataStudent.location;
   }

   table.setModel(new DefaultTableModel(dataStudentArray, titleenter2));
  }
  if (e.getSource() == button4) {
   new HomeworkEnrollBox();
  }
  if (e.getSource() == button5) {
   new HwPrintViewer();
  }
 }
////////////////////////////////////////////////////////////////////////////////////////////////
 ///////////////////Homework Print 버튼 클릭 후 창(GNU_HOMEWORK BOX////////////////////////////////
}
class HwPrintViewer extends JFrame implements ActionListener {
 JButton button1 = null;
 JButton button2 = null;
 JTable table = null;
 JTable table2 = null;
 
 ArrayList<Sub> temp_list;
 public HwPrintViewer() {
  super("GNU_Homwork Control Box");
  this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  this.setBounds(200, 200, 500, 700);
  this.setLayout(new FlowLayout());

  JPanel panelPrint = new JPanel();
  JPanel panelButton = new JPanel();
  JPanel panelRelated = new JPanel();
  
  panelPrint.setLayout(new FlowLayout());
  panelButton.setLayout(new FlowLayout());
  panelRelated.setLayout(new FlowLayout());
  
  String hwtitle[] = new String[3];
  hwtitle[0] = "Subject due Date";
  hwtitle[1] = "Major or Not";
  hwtitle[2] = "Prof Name";



  int size = HWManager.list.size();
  String[][] dataProArray = new String[size][3];

  for (int i = 0; i < size; i++) {
   HomworkandSubject dataPro = HWManager.list.get(i);

   dataProArray[i][0] = dataPro.profname;
   dataProArray[i][1] = dataPro.major;
   dataProArray[i][2] = dataPro.duedate;
  }

  
  table = new JTable(dataProArray, hwtitle);
  JScrollPane sp = new JScrollPane(table);
  sp.setPreferredSize(new Dimension(350, 300));
  panelPrint.add(sp);
  
  button1 = new JButton("The Information Join and Print");
  button1.addActionListener(this);
  panelButton.add(button1);

  button2 = new JButton("Complete");
  button2.addActionListener(this);
  panelButton.add(button2);
  
  
  String data[][] = new String[0][0];
  table2 = new JTable(data,hwtitle);
  JScrollPane sp2 = new JScrollPane(table2);
  sp2.setPreferredSize(new Dimension(350, 300));
  panelRelated.add(sp2);
  
  this.add(panelPrint);
  this.add(panelButton);
  this.add(panelRelated);
  this.setVisible(true);
 }

 public void RepopinTable(){
  String hwtitle2[] = new String[3];
  hwtitle2[0] = "Subject due Date";
  hwtitle2[1] = "Major or Not";
  hwtitle2[2] = "Prof Name";
  int size = temp_list.size();
  String[][] DataSubjectArray = new String[size][3];

  for (int i = 0; i < size; i++) {
   Sub dataSubject = temp_list.get(i);

   DataSubjectArray[i][0] = dataSubject.thebooknames;
   DataSubjectArray[i][1] = dataSubject.majorornot;
   DataSubjectArray[i][2] = dataSubject.location;
  }

  table2.setModel(new DefaultTableModel(DataSubjectArray, hwtitle2));
 }
 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==button1){
   if (table.getSelectedRow() == -1) {
   } else {
    int deleteIndex = table.getSelectedRow();
    HomworkandSubject hs = HWManager.list.get(deleteIndex);
    temp_list = new ArrayList<Sub>();
    for(Sub s : SubjectManager.list){
     if(s.professor.equals(hs.duedate)){
      temp_list.add(s);
     }
    }


    this.RepopinTable();
   }
  }
  if(e.getSource()==button2){
   dispose();
  }
  
 }
}

class SubjectRegisterBOX extends JFrame implements ActionListener {

 JLabel thebooknames, buildinglocation, resubjectnames;
 JTextField resubjecttimes_t, gpa_t;
 JRadioButton major, notmajor;
 JComboBox subjectname_combo;
 JButton button1, button2;
 ButtonGroup group;

 public SubjectRegisterBOX() {
  super("Subject Register ControlBOX");
  this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  this.setBounds(400, 400, 450, 500);
  this.setLayout(new FlowLayout());

  JPanel panelName = new JPanel();
  JPanel panelRadio = new JPanel();
  JPanel panelAge = new JPanel();
  JPanel panelCombo = new JPanel();
  JPanel panelButton = new JPanel();

  panelName.setLayout(new FlowLayout());
  panelRadio.setLayout(new FlowLayout());
  panelAge.setLayout(new FlowLayout());
  panelCombo.setLayout(new FlowLayout());
  panelButton.setLayout(new FlowLayout());
  
  

  thebooknames = new JLabel("The Book Names : ");
  buildinglocation = new JLabel("The Building Location : ");
  resubjectnames = new JLabel("Subject Name : ");
  resubjecttimes_t = new JTextField(5);
  gpa_t = new JTextField(5);
  subjectname_combo = new JComboBox();
  major = new JRadioButton("Major", false);
  notmajor = new JRadioButton("Not_Major", false);
  button1 = new JButton("Complete");
  button2 = new JButton("Cancle");
  button1.addActionListener(this);
  button2.addActionListener(this);
  group = new ButtonGroup();
  group.add(major);
  group.add(notmajor);

  for (HomworkandSubject p : HWManager.list) {
   subjectname_combo.addItem(p.duedate);
  }

  panelName.add(thebooknames);
  panelName.add(resubjecttimes_t);

  panelRadio.add(major);
  panelRadio.add(notmajor);

  panelAge.add(buildinglocation);
  panelAge.add(gpa_t);

  panelCombo.add(resubjectnames);
  panelCombo.add(subjectname_combo);

  panelButton.add(button1);
  panelButton.add(button2);

  this.add(panelName);
  this.add(panelRadio);
  this.add(panelAge);
  this.add(panelCombo);
  this.add(panelButton, BorderLayout.SOUTH);

  this.setVisible(true);
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  if (e.getSource() == button1) {
   String str = (String) subjectname_combo.getSelectedItem();
   int selectedIndex = subjectname_combo.getSelectedIndex();
   String major_2 = "";
   if (major.isSelected()) {
    major_2 = major.getText().toString();
   } else {
    major_2 = notmajor.getText().toString();
   }
   Sub s = new Sub(resubjecttimes_t.getText().toString().trim(), major_2, gpa_t.getText().toString().trim(),str);
   SubjectManager.list.add(s);
   major.setSelected(false);
   notmajor.setSelected(false);
   resubjecttimes_t.setText(null);
   gpa_t.setText(null);

  }
  if (e.getSource() == button2) {
   dispose();
  }
 }

}

class HomeworkEnrollBox extends JFrame implements ActionListener {
 JLabel profname, duedate, resubjectnames;
 JTextField profname_t, duedate_t;
 JRadioButton mjaor_1, major_2;
 JComboBox subjectnames;
 JButton button1, button2;
 ButtonGroup group;

 public HomeworkEnrollBox() {
  super("Enroll that the Homework");

  this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  this.setBounds(200, 200, 500, 600);
  this.setLayout(new FlowLayout());

  JPanel panelName = new JPanel();
  JPanel panelRadio = new JPanel();
  JPanel panelAge = new JPanel();
  JPanel panelCombo = new JPanel();
  JPanel panelButton = new JPanel();

  panelName.setLayout(new FlowLayout());
  panelRadio.setLayout(new FlowLayout());
  panelAge.setLayout(new FlowLayout());
  panelCombo.setLayout(new FlowLayout());
  panelButton.setLayout(new FlowLayout());

  profname = new JLabel("Prof Name : ");
  duedate = new JLabel("Subject Due Date : ");
  resubjectnames = new JLabel("Subject Name : ");
  profname_t = new JTextField(10);
  duedate_t = new JTextField(10);
  subjectnames = new JComboBox();
  mjaor_1 = new JRadioButton("Major", false);
  major_2 = new JRadioButton("Not_Major", false);
  button1 = new JButton("Complete");
  button2 = new JButton("Cansle");
  button1.addActionListener(this);
  button2.addActionListener(this);
  group = new ButtonGroup();
  group.add(mjaor_1);
  group.add(major_2);
  subjectnames.addItem("JAVA and OOP");
  subjectnames.addItem("Aerodynamic");
  subjectnames.addItem("Thermodynamic");
  subjectnames.addItem("DataBase SQL");
  subjectnames.addItem("FluidDynamic");
  subjectnames.addItem("CapStone");
  subjectnames.addItem("DeepLearning");
  subjectnames.addItem("Operating System");
  subjectnames.addItem("LINUX Kernel");
  subjectnames.addItem("AeroSpaceEngineering System");
  subjectnames.addItem("Soccer and Sports");
  subjectnames.addItem("Tracking to Mountin");
  subjectnames.addItem("How Principle of Breathing from Water");

  panelName.add(profname);
  panelName.add(profname_t);

  panelRadio.add(mjaor_1);
  panelRadio.add(major_2);

  panelAge.add(duedate);
  panelAge.add(duedate_t);

  panelCombo.add(resubjectnames);
  panelCombo.add(subjectnames);

  panelButton.add(button1);
  panelButton.add(button2);

  this.add(panelName);
  this.add(panelRadio);
  this.add(panelAge);
  this.add(panelCombo);
  this.add(panelButton, BorderLayout.SOUTH);

  this.setVisible(true);

 }

 @Override
 public void actionPerformed(ActionEvent e) {
  if (e.getSource() == button1) {
   String str = (String) subjectnames.getSelectedItem();
   int selectedIndex = subjectnames.getSelectedIndex();
   String major = "";
   if (mjaor_1.isSelected()) {
    major = mjaor_1.getText().toString();
   } else {
    major = major_2.getText().toString();
   }
   HomworkandSubject p = new HomworkandSubject(profname_t.getText().toString().trim(), major, duedate_t.getText().toString().trim(), str);
   HWManager.list.add(p);
   mjaor_1.setSelected(false);
   major_2.setSelected(false);
   profname_t.setText(null);
   duedate_t.setText(null);

  }
  if (e.getSource() == button2) {
   dispose();
  }
 }

}

class Sub {
 String thebooknames;
 String majorornot;
 String location;
 String professor;

 public Sub(String name, String gpa, String subjectime,String professor) {
  this.thebooknames = name;
  this.majorornot = gpa;
  this.location = subjectime;
  this.professor = professor;
 }
}

class SubjectManager {
 public static ArrayList<Sub> list = new ArrayList<Sub>();
}

class HomworkandSubject {
 String duedate;
 String major;
 String profname;
 String subject;

// ArrayList<Stu> s = new ArrayList<Stu>();
 
 public HomworkandSubject(String date, String ma, String profnam, String subject) {
  this.duedate = date;
  this.major = ma;
  this.profname = profnam;
  this.subject = subject;
 }
}

class HWManager {
 public static ArrayList<HomworkandSubject> list = new ArrayList<HomworkandSubject>();
}

//Reference
// [1] : https://blog.naver.com/sks6624/150165616213 : 스크롤페인 참고자
// [2] : https://www.crocus.co.kr/551 : 라디오박스 참고자료
// [3] : Java의 정석
// [4] : https://whiteit.tistory.com/111 : 콤보박스 참고자료
//

