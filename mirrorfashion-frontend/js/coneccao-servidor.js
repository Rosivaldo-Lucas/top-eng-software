const imagesUrl = (page) => `https://picsum.photos/v2/list?limit=8&page=${page}`;

const newPainel = (selector) => {
  let p = {
    page: 1,
    element: document.querySelector(selector)
  };

  p.render = () => 
    fetch(imagesUrl(p.page)).then(response => response.json())
      .then(data => {
        const l = document.createElement("ol");

        data.forEach(imagem => {
          const item = document.createElement("li");
          item.innerHTML = 
            `<a>
              <figure>
                <img class="imagem">
                <figcaption></figcaption>
              </figure>
            </a>`

          item.querySelector("a").href = "produto.html";
          item.querySelector("img").src = imagem.download_url;
          item.querySelector("figcaption").innerHTML = imagem.author;

          l.appendChild(item);
        });

        p.element.appendChild(l);
      }).catch(error => console.log(error));

  p.element.querySelector("button").addEventListener("click", () => {
    p.page += 1;
    p.render();
  });

  return p;
}

[newPainel(".novidades"), newPainel(".mais-vendidos")].forEach(p => p.render());
