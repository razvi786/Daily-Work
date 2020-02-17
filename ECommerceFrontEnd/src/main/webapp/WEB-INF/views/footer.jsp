	</div>

  <footer class="footer bg-secondary p-3 container-fluid">
    <div class="row">
      <div class="col-3 text-center">
        <i class="fas fa-copyright fa-2x text-light mx-2"></i>
      </div>
      <div class="col-6 text-center">
        <p class="font-italic text-light h5">Created by: Slackers</p>
      </div>
    </div>
  </footer>


  <script src="https://kit.fontawesome.com/b1d2774758.js" crossorigin="anonymous"></script>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
  </script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
    integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous">
  </script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
    integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous">
  </script>

  <script>
    //Tooltip Enable
    $(function () {
      $('[data-toggle="tooltip"]').tooltip()
    })

    //Popover Enable
    $(function () {
      $('[data-toggle="popover"]').popover()
    })

    //Popover Dismiss
    $('.popover-dismiss').popover({
      trigger: 'focus'
    })
  </script>
</body>

</html>