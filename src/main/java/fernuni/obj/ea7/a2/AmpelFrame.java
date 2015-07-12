package fernuni.obj.ea7.a2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AmpelFrame extends Frame implements MyEventsListener{
    private static final long serialVersionUID = -6023926227935950215L;
    
    public static final int FRAME_HEIGHT = 400;
    public static final int FRAME_WIDTH = 120;
    
    private static SourceOfMyEvents source = new SourceOfMyEvents();
    
    private Light redLight = new Light(10, 10, 100, Color.RED);
    private Light yellowLight = new Light(10, 10, 100, Color.YELLOW);
    private Light greenLight = new Light(10, 10, 100, Color.GREEN);
    
    private boolean isTrafficLightinitialized = false;
    
    public AmpelFrame() {
        
        //Dimensions
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - FRAME_WIDTH) / 2);
        int y = (int) ((dimension.getHeight() - FRAME_HEIGHT) / 2);
        
        this.setBounds(x, y, FRAME_WIDTH, FRAME_HEIGHT);
        
        
        //Layout
        GridLayout gridLayout = new GridLayout(3,1); //for traffic lights
        BorderLayout borderLayout = new BorderLayout(); //for the frame        
                
        Container trafficLightContainer = new Container(); 
        trafficLightContainer.setLayout(gridLayout);
        
        this.setLayout(borderLayout);
        this.add(trafficLightContainer, BorderLayout.CENTER);
        
        //creating and adding the needed objects
        trafficLightContainer.add(redLight);
        trafficLightContainer.add(yellowLight);
        trafficLightContainer.add(greenLight);        
        
        Button button = new Button("weiterschalten");
        
        button.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (isTrafficLightinitialized) {
					source.nextState();
				} else {
					isTrafficLightinitialized = true;
					
					//fireEvent / use the existing method to turn the traffic light only to red without the state machine 
					fireRedEvent(null);
				}
								
			}
		});
        
        
        this.add(button, BorderLayout.SOUTH);
        
        addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
        });
        
        source.addMyEventsListener(this);
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException, InterruptedException {    	
		AmpelFrame ampel = new AmpelFrame();
        ampel.setVisible(true);                
    }
    
    @Override
	public void fireRedEvent(MyEventsEvent e) {
		System.out.println("fireRedEvent aufgetreten");

		redLight.turnOn();
		yellowLight.turnOff();
		greenLight.turnOff();
	}

	@Override
	public void fireRedYellowEvent(MyEventsEvent e) {
		System.out.println("fireRedYellowEvent aufgetreten");
		
		redLight.turnOn();
		yellowLight.turnOn();
		greenLight.turnOff();		
	}

	@Override
	public void fireGreenEvent(MyEventsEvent e) {
		System.out.println("fireGreenEvent aufgetreten");
		
		redLight.turnOff();
		yellowLight.turnOff();
		greenLight.turnOn();
	}

	@Override
	public void fireYellowEvent(MyEventsEvent e) {
		System.out.println("fireYellowEvent aufgetreten");
		
		redLight.turnOff();
		yellowLight.turnOn();
		greenLight.turnOff();
	}
}