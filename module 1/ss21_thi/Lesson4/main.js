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

    render(){
        const canvas = document.getElementById("canvas");
        const ctx = canvas.getContext("2d");
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius,0 , 2*Math.PI );
        ctx.fillStyle= this.color ;
        ctx.fill();
    }
}
let cicle1 = new Cricle(50,50,80,"#000000")
cicle1.render();