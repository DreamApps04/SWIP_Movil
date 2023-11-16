
   $(document).ready(function () {
        $("input[name='icono']").change(function () {

            var selectedIcon = $("input[name='icono']:checked").val();

            $(".icono-container-table span i").removeClass().addClass(selectedIcon);
        });
    });

