package Maquina;

public enum TipoDoCafe {EXPRESSO, CARIOCA}

    public Bebida entregaBebiba(TipoDoCafe tipoDoCafe) {
        Bebida cafe = null;

        switch (tipoDoCafe) {
            case EXPRESSO: cafe = new CafeExpresso();
            case CARIOCA: cafe = new CafeCarioca();
        }

        return cafe;

    }




