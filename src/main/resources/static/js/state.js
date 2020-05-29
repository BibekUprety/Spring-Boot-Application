
$('document').ready(function(){

    $('table #editButton').on('click',function(event){
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function(state, status){
            $('#idEdit').val(state.id);
            $('#nameEdit').val(state.name);
            $('#capitalEdit').val(state.capital);
            $('#codeEdit').val(state.code);
            $('#detailsEdit').val(state.details);
            // $('#nationalityEdit').val(country.nationality);
        });
        $('#editModal').modal();
    });

    $('table #deleteButton').on('click', function(event){
        event.preventDefault();

        var href= $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);

        $('#deleteModal').modal();
    });

    $('.table #detailsButton').on('click',function(event) {

        event.preventDefault();

        var href= $(this).attr('href');

        $.get(href, function(state, status){

            $('#idDetails').val(state.id);
            // $('#countryDetails').val(state.countryid);
            // $('#nameDetails').val(state.name);
            // $('#detailsDetails').val(state.details);
            // $('#lastModifiedByDetails').val(state.lastModifiedBy);
            //$('#lastModifiedDateDetails').val(state.lastModifiedDate.substr(0,19).replace("T", " "));
        });
        $('#detailsModal').modal();
    });

});