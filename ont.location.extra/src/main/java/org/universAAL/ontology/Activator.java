package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.location.extra.*;

public class Activator implements BundleActivator {

	static BundleContext context = null;
	
	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		Class.forName(AbsolutePosition.class.getName());
		Class.forName(Address.class.getName());
		Class.forName(BuildingPlace.class.getName());
		Class.forName(FloorSwitcherPlace.class.getName());
		Class.forName(MailBox.class.getName());
		Class.forName(OtherPlace.class.getName());
		Class.forName(PhysicalAddress.class.getName());
		Class.forName(Place.class.getName());
		Class.forName(PlaceType.class.getName());
		Class.forName(PLocation.class.getName());
		Class.forName(Point.class.getName());
		Class.forName(Position.class.getName());
		Class.forName(RelativePosition.class.getName());
		Class.forName(RoomPlace.class.getName());	
	}
	
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
