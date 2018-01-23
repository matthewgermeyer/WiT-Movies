$(document).ready(function(){
    $('.nBtn, .table .eBtn').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();
        if(text=='Edit'){

        $.get(href,function(movie,status){

            $('.myForm #id').val(movie.id);
            $('.myForm #name').val(movie.name);
            $('.myForm #description').val(movie.description);

    });
    $('.myForm #exampleModal').modal();
    } else {
                    $('.myForm #id').val('');
                    $('.myForm #name').val('');
                    $('.myForm #description').val('');
                    $('.myForm #exampleModal').modal();
    }
    });
$('.table .delBtn').on('click',function(event){
    event.preventDefault();
    var href = $(this).attr('href');
    $('#myModal #delRef').attr('href',href);
    $('#myModal').modal();
});


});
