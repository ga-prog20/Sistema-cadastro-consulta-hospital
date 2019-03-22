
package bins;

/**
 *
 * @author jeferson
 */
public class Paciente extends Pessoa{
    private String rg;
    private String doenca;

    public Paciente() {
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }
    
}
