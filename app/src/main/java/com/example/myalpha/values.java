package com.example.myalpha;

class Values {
    private Double m1;
    private Double m2;
    private Double v1;
    private Double v2;
    private Double u1;
    private Double u2;

    public Values(Double m1, Double m2,Double v1, Double v2){
        this.m1 = m1;
        this.m2 = m2;
        this.v1 = v1;
        this.v2 = m2;
        this.u1 = 0.0;
        this.u2 = 0.0;
    }

    public Double getM1() {
        return m1;
    }

    public Double getM2() {
        return m2;
    }

    public Double getV1() {
        return v1;
    }

    public Double getV2() {
        return v2;
    }

    public Double getU1() {
        return u1;
    }

    public Double getU2() {
        return u2;
    }

    public void setM1(Double m1) {
        this.m1 = m1;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    public void setV1(Double v1) {
        this.v1 = v1;
    }

    public void setV2(Double v2) {
        this.v2 = v2;
    }

    public void setU1(Double u1) {
        this.u1 = u1;
    }

    public void setU2(Double u2) {
        this.u2 = u2;
    }


     /* v1 - v2 = -(u1-u2)
    u2 = v1 - v2 + u1
    m1v1 + m2v2 = m1u1 + m2u2
    m1u1 + m2(v1-v2+u1) = m1v1 + m2v2
            (m1+m2)u1 = m1v1 + m2v2 - m2v1 + m2v2
    u1 = (v1(m1-m2) + 2m2v2 ) / (m1+m2)
    u2 = v1 - v2 + u1 */
    public void calc(){
        double u1 = (this.getV1() * (this.getM1() - this.getM2()) + 2*this.getM2()*this.getV2()) / (this.getM1() + this.getM2());
        this.setU1(u1);
        double u2 = this.getV1() - this.getV2() + this.getU1();
        this.setU2(u2);

    }
}

