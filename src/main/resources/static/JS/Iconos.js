// Iconos.js

document.addEventListener('DOMContentLoaded', function () {
    // Agrega un evento de clic a todos los iconos
    var iconContainers = document.querySelectorAll('.icono-container');
    iconContainers.forEach(function (container) {
        container.addEventListener('click', function (event) {
            highlightIcon(container.id);
        });
    });

    // Desmarca el icono seleccionado al hacer clic en cualquier parte de la pantalla
    document.addEventListener('click', function (event) {
        iconContainers.forEach(function (container) {
            container.classList.remove('selected');
        });
    });
});

function highlightIcon(iconId) {
    var iconContainers = document.querySelectorAll('.icono-container');
    iconContainers.forEach(function (container) {
        container.classList.remove('selected');
    });

    var selectedIconContainer = document.getElementById(iconId);
    selectedIconContainer.classList.add('selected');
}
