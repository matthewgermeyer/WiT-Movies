$(document).ready(function(){
    $('.table .eBtn').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function(movie,status){

            $('.myForm #id').val(movie.id);
            $('.myForm #name').val(movie.name);
            $('.myForm #description').val(movie.description);

    });
    $('.myForm #exampleModal').modal();


    });
});
