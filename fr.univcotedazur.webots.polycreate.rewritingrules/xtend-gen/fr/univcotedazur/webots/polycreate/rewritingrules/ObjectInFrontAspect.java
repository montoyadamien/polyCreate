package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.ObjectInFront;
import fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectProperties;

@Aspect(className = ObjectInFront.class)
@SuppressWarnings("all")
public abstract class ObjectInFrontAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean isValid(final ObjectInFront _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.ObjectInFront){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspect._privk3_isValid(_self_, (fr.univcotedazur.webots.polycreate.ObjectInFront)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "ObjectInFront", "isValid");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isValid(final ObjectInFrontAspectObjectInFrontAspectProperties _self_, final ObjectInFront _self, final PolyCreateControler controler) {
    return controler.isThereVirtualwall();
  }
}
