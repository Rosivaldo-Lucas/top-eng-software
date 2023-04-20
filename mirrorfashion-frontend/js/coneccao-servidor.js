const sessaoNovidades = document.querySelector(".novidades");
const maisVendidos = document.querySelector(".mais-vendidos");

const url = `https://picsum.photos/v2/list?limit=8`; // URL da API do Lorem Picsum

fetch(url).then(response => {
    return response.json();
}).then(data => {
    const listaItensNovidades = document.createElement("ol");
    const listaItensMaisVendidos = document.createElement("ol");

    data.forEach(imagem => {
        const itemLista = document.createElement("li");
        const itemLink = document.createElement("a");
        const itemFigure = document.createElement("figure");
        const itemImage = document.createElement("img");
        const itemFigcaption = document.createElement("figcaption");

        itemLink.href = "produto.html";
        itemImage.src = imagem.download_url;
        itemFigcaption.innerHTML = imagem.author;

        itemFigure.appendChild(itemImage);
        itemFigure.appendChild(itemFigcaption);
        itemLink.appendChild(itemFigure);
        itemLista.appendChild(itemLink);

        listaItensNovidades.appendChild(itemLista);

        itemImage.classList.add("imagem");
    });

    data.forEach(imagem => {
        const itemLista = document.createElement("li");
        const itemLink = document.createElement("a");
        const itemFigure = document.createElement("figure");
        const itemImage = document.createElement("img");
        const itemFigcaption = document.createElement("figcaption");

        itemLink.href = "produto.html";
        itemImage.src = imagem.download_url;
        itemFigcaption.innerHTML = imagem.author;

        itemFigure.appendChild(itemImage);
        itemFigure.appendChild(itemFigcaption);
        itemLink.appendChild(itemFigure);
        itemLista.appendChild(itemLink);

        listaItensMaisVendidos.appendChild(itemLista);

        itemImage.classList.add("imagem");
    });

    sessaoNovidades.appendChild(listaItensNovidades);
    maisVendidos.appendChild(listaItensMaisVendidos);
}).catch(error => {
    console.log(error);
});
