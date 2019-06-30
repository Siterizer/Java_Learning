class FigureCopier {
    private Figure f;
    FigureCopier(Figure f){
        this.f = f;
    }
    Figure copyFigure(){
        return f.clone();
    }

}
