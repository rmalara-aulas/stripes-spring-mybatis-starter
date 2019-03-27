
package training.actionbeans;

import lombok.Getter;
import lombok.Setter;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * Classe base de todas as ActionBeans, que contém o código compartilhado entre elas.
 * 
 * @author Davi Bezerra
 */
public abstract class BaseActionBean implements ActionBean {

    /** O contexto gerado pelo Stripes. */
    private @Getter @Setter ActionBeanContext context;
}
