package ru.windowsconstructor.constructprocess.utils.Wizards.Language;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;
import ru.windowsconstructor.constructprocess.utils.Wizards.IWizard;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class WizardExpressionTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(WizardExpression.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    public static void TestSimpleWizrdcreation(){
        IWizard wizard = WizardExpression
                .Empty()
                .WithName("123")
                .WithFirstStep(null)
                    .Next(null)
                    .Conditional(null, null, null)
                    .Next(null)
        .GetWizard();
    }

}
