const v = {
    x: 3,
    y: 4,
}

function length(vecteur) {
    const {x, y} = vecteur;
    return Math.sqrt(x * x + y * y);
}

console.log(length(v));