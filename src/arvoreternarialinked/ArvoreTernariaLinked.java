package arvoreternarialinked;

import java.util.Collection;

/**
 *
 * @author gsnet
 */
public class ArvoreTernariaLinked<Chave extends Comparable<Chave>, Valor> implements IArvoreTernariaLinked<Chave, Valor> {
    
    private No<Chave, Valor> raiz;

    public ArvoreTernariaLinked() {    }

    @Override
    public No<Chave, Valor> inserir(Chave chave, Valor valor, No<Chave, Valor> pai, Lado lado) {
        No<Chave, Valor> novoNo = new No(chave, valor);
        
        if (this.raiz == null) {
            this.raiz = novoNo;
            return novoNo;
        } else {
            novoNo.setPai(pai);
            
            if (lado == Lado.ESQUERDO) {
                if (pai.getFilhoEsquerdo() == null) {
                    pai.setFilhoEsquerdo(novoNo);
                    return novoNo;
                }
            }
            
            if (lado == Lado.MEIO) {
                if (pai.getFilhoMeio() == null) {
                    pai.setFilhoMeio(novoNo);
                    return novoNo;
                }
            }
            
            if (lado == Lado.DIREITO) {
                if (pai.getFilhoDireito() == null) {
                    pai.setFilhoDireito(novoNo);
                    return novoNo;
                }
            }
            
            
        }
        
        return null;
        
    }

    @Override
    public No<Chave, Valor> obterFilho(No<Chave, Valor> pai, Lado lado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public No<Chave, Valor> obterFilho(Chave chave, Lado lado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public No<Chave, Valor> remover(No<Chave, Valor> no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public No<Chave, Valor> remover(No<Chave, Valor> pai, Lado lado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public No<Chave, Valor> remover(Chave chave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Valor> obterValores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public No<Chave, Valor> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<Chave, Valor> raiz) {
        this.raiz = raiz;
    }
    
}
