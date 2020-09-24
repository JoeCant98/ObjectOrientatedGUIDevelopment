import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

public class GUI extends JFrame {

    private JButton inputRoute, saveRoute, loadRoute;
	private JComboBox DepartStations;
	private JComboBox ArrivStations;
	public String ArrivString;
	public String DepartString;
	public double SingleTicket;
	public double ReturnTicket;
	public String Time;
	public String dates;
	public JTextField textDate;
	
	
	public GUI(){
		setLayout(new GridLayout(1,2));
		
	DepartStations = new JComboBox();
	DepartStations.addItem("Worcester");
	DepartStations.addItem("Droitwich Spa");
	DepartStations.addItem("Hereford");
	DepartStations.addItem("Bristol");
	DepartStations.addItem("Gloucester");//creating combobox
	


	ArrivStations = new JComboBox();
	ArrivStations.addItem("Worcester");
	ArrivStations.addItem("Droitwich Spa");
	ArrivStations.addItem("Hereford");
	ArrivStations.addItem("Bristol");
	ArrivStations.addItem("Gloucester");//creating combobox


	
	JButton timeButton, priceButton, routeButton, sortButton, adminButton, endButton, dateButton;
	timeButton = new JButton("Time");
	priceButton = new JButton("Price");
	routeButton = new JButton("Route");
	sortButton = new JButton("Sort");
	adminButton = new JButton("Admin");
	endButton = new JButton("END");
    dateButton = new JButton("Done");//creating buttons
	
	JPanel stations = new JPanel();
	JPanel menu = new JPanel();//creating panels
	
	menu.add(timeButton);
	menu.add(priceButton);
	menu.add(routeButton);
	menu.add(sortButton);
	menu.add(adminButton);
	menu.add(endButton);//adding buttons
	
	event handler = new event();
	timeButton.addActionListener(handler);
	priceButton.addActionListener(handler);
	routeButton.addActionListener(handler);
	sortButton.addActionListener(handler);
	adminButton.addActionListener(handler);
	endButton.addActionListener(handler);
    dateButton.addActionListener(handler);//creating action listeners for the buttons
	
	JLabel labelDep = new JLabel("Select Departing Station:");
	JLabel labelArri = new JLabel("Select Arrival Station:");
	JLabel labelDate = new JLabel("Input date of travel (dd/mm/yy):");
	JTextField textDate = new JTextField();
	textDate.setColumns(8);
    textDate.setText("dd/mm/yy");//default text is set to "dd/MM/yy"
    this.textDate = textDate;//allows it to be used elsewhere

	stations.add(labelDep);
	stations.add(DepartStations);
	stations.add(labelArri);
	stations.add(ArrivStations);
	stations.add(labelDate);
	stations.add(textDate);
	stations.add(dateButton);//adding labels and combobox

	add(stations);
	add(menu);//adding panels
	}
	
	public class event implements ActionListener {
	    public void actionPerformed(ActionEvent handler) {
			 JButton clickedButton = (JButton) handler.getSource();
             String buttonText = clickedButton.getText();
			 if (buttonText.equals("END")){System.exit(0);}
			 if (buttonText.equals("Price")){getPrice();}
			 if (buttonText.equals("Time")){getTime();}
			if (buttonText.equals("Done")){checkDate();}
			if (buttonText.equals("Admin")){adminMenu();}
        }
    }//event handler for the buttons 
	
   public void getPrice(){
	   DepartString = (String) DepartStations.getSelectedItem();
	   ArrivString = (String) ArrivStations.getSelectedItem();//saves selected item in comboboxes to a String
       double nD;
      String[] brokenInput = new String[3];

      brokenInput = dates.split("/");

      Integer day = Integer.parseInt(brokenInput[0]);

      Integer month = Integer.parseInt(brokenInput[1]);

      Integer year = Integer.parseInt(brokenInput[2]);//Date is split into an array of 3 strings, day, month and year

      if ((day == 1) && (isValidDate(dates))) {
     nD = 0.8;//used for discount

     JOptionPane.showMessageDialog( null, "A discount of 20% has been applied.");}
else {nD = 1;}
	 

    switch (DepartString){

      case "Worcester":

          switch (ArrivString){
			  
			case "Worcester":
			
			SingleTicket = -1;
			
			break;
           
		   case "Droitwich Spa":

             SingleTicket = (2.50*nD);

             ReturnTicket = (4.00*nD);

             break;

           case "Hereford":

             SingleTicket = (4.60*nD);

             ReturnTicket = (6.40*nD);
             
             break;

           case "Bristol":

             SingleTicket = (5.00*nD);

             ReturnTicket = (8.00*nD);

             break;

           case "Gloucester":

             SingleTicket = (3.50*nD);

             ReturnTicket = (5.00*nD);

             break;

          }

          break;

          

      case "Droitwich Spa":

          switch (ArrivString){
			  
			  case "Droitwich Spa":
			  SingleTicket = -1;
             break;
           case "Worcester":

             SingleTicket = (2.50*nD);

             ReturnTicket = (4.00*nD);

             break;

           case "Hereford":

             SingleTicket = (5.50*nD);

             ReturnTicket = (7.30*nD);

             break;

           case "Bristol":

             SingleTicket = (6.25*nD);

             ReturnTicket = (8.50*nD);

             break;

           case "Gloucester":

             SingleTicket = (5.90*nD);

             ReturnTicket = (8.00*nD);

             break;

          }

          break;

       case "Hereford":

          switch (ArrivString){
			  case "Hereford":
			  SingleTicket = -1;
              break;
           case "Worcester":

             SingleTicket = (4.60*nD);

             ReturnTicket = (6.40*nD);

             break;

              case "Droitwich Spa":

             SingleTicket =  (5.50*nD);

             ReturnTicket =  (7.30*nD);

             break;

              case "Bristol":

             SingleTicket = (9.50*nD);

             ReturnTicket = (12.00*nD);

             break;

              case "Gloucester":

             SingleTicket = (8.65*nD);

             ReturnTicket =  (14.00*nD);
             
             break;

          }

          break;

        case "Bristol":

          switch (ArrivString){

		   case "Bristol":
		   SingleTicket = -1;
		   break;
            case "Worcester":
             SingleTicket = (5.00*nD);

             ReturnTicket = (8.00*nD);

             break;

              case "Droitwich Spa":

             SingleTicket = (6.25*nD);

             ReturnTicket = (8.50*nD);

             break;

              case "Hereford":

             SingleTicket = (9.50*nD);

             ReturnTicket =(12.00*nD);

             break;

              case "Gloucester":

             SingleTicket = (2.45*nD);

             ReturnTicket = (4.00*nD);

             break;

          }

          break;

        case "Gloucester":

          switch (ArrivString){

		  case "Gloucester": 
		  
		  SingleTicket = -1;
		  break;
           case "Worcester":

             SingleTicket =(3.50*nD);

             ReturnTicket = (5.00*nD);

             break;

              case "Droitwich Spa":

             SingleTicket = (5.90*nD);

             ReturnTicket = (8.00*nD);

             break;

              case "Hereford":

             SingleTicket = (8.65*nD);

             ReturnTicket = (14.00*nD);

             break;

              case "Bristol":

             SingleTicket = (2.45*nD);

             ReturnTicket = (4.00*nD);

             break;

          }

          break;

      }
DecimalFormat df = new DecimalFormat("#.##");      
SingleTicket = Double.valueOf(df.format(SingleTicket));
ReturnTicket = Double.valueOf(df.format(ReturnTicket));//limits values to two decimal places
if (SingleTicket == -1){
JOptionPane.showMessageDialog(null,"Departing Station can not equal arrival station.");}
else{
    JOptionPane.showMessageDialog( null,"Single Ticket = \u00a3" + SingleTicket + " Return Ticket = \u00a3" + ReturnTicket);
}
  
   }
   public void getTime(){
	  
	   DepartString = (String) DepartStations.getSelectedItem();
	   ArrivString = (String) ArrivStations.getSelectedItem();
	    switch (DepartString){

      case "Worcester":

          switch (ArrivString){

           case "Droitwich Spa":

             Time = "30 mins";
			 
             break;

           case "Hereford":

			 Time = "1 hour 5 minutes";
           
             break;

           case "Bristol":

			 Time = "1 hour 40 minutes";
			 
             break;

           case "Gloucester":

			 Time = "1 hour 10 minutes";
            
             break;

          }

          break;

          

      case "Droitwich Spa":

          switch (ArrivString){

           case "Worcester":

			 Time = "30 minutes";
			 
             break;

           case "Hereford":

			 Time = "1 hour 15 minutes";
			 
             break;

           case "Bristol":

			 Time = "2 hours";

             break;

           case "Gloucester":

			 Time = "1 hour";
			 
             break;

          }

          break;

       case "Hereford":

          switch (ArrivString){

           case "Worcester":

			 Time = "1 hour 5 minutes";
			 
             break;

              case "Droitwich Spa":

			 Time = "1 hour 15 minutes";
			 
             break;

              case "Bristol":

			 Time = "2 hours";
			 
             break;

              case "Gloucester":

			 Time = "1 hour 55 minutes";
			 
             break;

          }

          break;

        case "Bristol":

          switch (ArrivString){

           case "Worcester":

			 Time = "1 hour 40 minutes";
			 
             break;

              case "Droitwich Spa":

			 Time = "2 hours";
			 
             break;

              case "Hereford":

			 Time = "2 hours";
			 
             break;

              case "Gloucester":

			 Time = "25 minutes";
			 
             break;

          }

          break;

        case "Gloucester":

          switch (ArrivString){

           case "Worcester":

			 Time = "1 hour 10 minutes";
			 
             break;

              case "Droitwich Spa":

			 Time = "1 hour";
			 
             break;

              case "Hereford":

			 Time = "1 hour 55 minutes";
			 
             break;

              case "Bristol":
			  
			 Time = "25 minutes";
			 
             break;

          }

          break;

      }
	  
	  JOptionPane.showMessageDialog( null, Time);
   }
    public static boolean isValidDate(String date){

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
boolean isValid = true;

    Date testDate = null;

    try{

      testDate = sdf.parse(date);

      }

    catch (ParseException e){

       JOptionPane.showMessageDialog( null, "The date you provided is in an invalid date format.");

      return false;

      }



    if (!sdf.format(testDate).equals(date) || testDate.before(new Date())){

      JOptionPane.showMessageDialog( null, "The date that you provided is invalid.");

      return false;

      }

    else{

    return true;

    }



  
  }//checks if date is valid and not before current date
 public void checkDate(){

      dates = textDate.getText();
     this.dates = dates;

      if(!isValidDate(dates)){
            JOptionPane.showMessageDialog( null, "Please enter a valid date.");

}
else {JOptionPane.showMessageDialog( null, "The information has been submitted.");}
			 
}//uses the isvalid method to check dates inputted
public void adminMenu(){
	JFrame Admin = new JFrame();
	Admin.setLayout(new FlowLayout());
	inputRoute = new JButton("Input Route");
	saveRoute = new JButton("Save Route");
	loadRoute = new JButton("Retrieve Route");
    Admin.add(inputRoute);
	Admin.add(saveRoute);
	Admin.add(loadRoute);
	Admin.setDefaultCloseOperation(Admin.EXIT_ON_CLOSE);
	Admin.setSize(275,180);
	Admin.setVisible(true);//new JFrame created on clicking Admin
}

}