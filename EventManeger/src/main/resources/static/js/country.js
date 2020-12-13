$('doucument').ready(function (){
    $('table editButton').on('click',function (event){
        $('editModal').modal();
        event.preventDefault();
        var href=$(this).attr('href');


        $.get(href,function (country,status){

            $('#idEdit').va(country.id);
            $('#descriptionEdit').va(country.description);
            $('#codeEdit').va(country.code);
            $('#capitalEdit').va(country.capital);
            $('#continentEdit').va(country.continent);
            $('#nationalityEdit').va(country.nationality);


        });
        $('#editModal').modal();

    })
})