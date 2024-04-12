class Cricle {
    x;
    y;
    radius;
    color;

    constructor(x,y,radius,color) {
        this.x = x ;
        this.y = y ;
        this.radius = radius ;
        this.color = color ;
    }

    draw(){
        const canvas = document.getElementById("canvas");
        const ctx = canvas.getContext("2d");
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius,0 , 2*Math.PI );
        ctx.fillStyle= this.color ;
        ctx.fill();
    }
}