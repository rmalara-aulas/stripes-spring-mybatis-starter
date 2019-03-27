
package training.actionbeans;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 * Página principal do sistema.
 * 
 * @author Davi Bezerra
 */
@UrlBinding("/index.action")
public class IndexActionBean extends BaseActionBean {

    /** View de início do sistema. */
    private final static String VIEW_INDEX = "/WEB-INF/jsp/index.jsp";
    
    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution(VIEW_INDEX);
    }
    
}
