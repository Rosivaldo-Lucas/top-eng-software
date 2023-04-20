const imagesUrl = (page) => `https://picsum.photos/v2/list?limit=9&page=${page}`;

const newPainel = (selector) => {
  const parent = document.querySelector(selector);
  const list = document.createElement("ol");
  parent.appendChild(list);

  let p = {
    page: 1,
    list: list 
  };

  p.render = () => 
    fetch(imagesUrl(p.page))
      .then(response => response.json())
      .then(data => data.forEach(imagem => {
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

        p.list.appendChild(item);
      }))
      .catch(error => console.log(error));

  parent.querySelector("button").addEventListener("click", () => {
    p.page += 1;
    p.render();
  });

  return p;
}

[newPainel(".novidades"), newPainel(".mais-vendidos")].forEach(p => p.render());
