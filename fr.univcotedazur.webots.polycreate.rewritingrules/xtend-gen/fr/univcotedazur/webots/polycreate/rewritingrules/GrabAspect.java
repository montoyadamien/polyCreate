package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Grab;
import fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspectGrabAspectProperties;
import fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspect;

@Aspect(className = Grab.class)
@SuppressWarnings("all")
public class GrabAspect extends PhysicalActionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final Grab _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspectGrabAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspectGrabAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Grab){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.Grab)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "Grab", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final GrabAspectGrabAspectProperties _self_, final Grab _self, final PolyCreateControler controler) {
    System.out.println("Grabing object");
    controler.closeGripper();
    controler.passiveWait(0.5);
  }
}