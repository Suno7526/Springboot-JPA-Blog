let index = {
	init: function() {
		$("#btn-save").on("click", () => {
			this.save();
		});

		$("#btn-update").on("click", () => {
			this.update();
		});
	},

	save: function() {
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()
		};

		$.ajax({
			type: "POST",
			url: "/auth/joinProc",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType: "json"
		}).done(function(resp) {
			alert("회원가입이 완료되었습니다.");
			location.href = "/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		});
	},

	update : function(){

            let data = {
                id : $("#id").val(),
                username : $("#username").val(),
                password : $("#password").val(),
                email : $("#email").val()
            };

            $.ajax({
                type : "PUT",
                url : "/user",
                data : JSON.stringify(data),
                contentType : "application/json; charset=utf-8",
                dataType : "json"

            }).done(function(resp) {
                alert("회원수정완료");

                location.href ="/"
            }).fail(function(error) {
                alert("회원수정실패 다시 한번 확인해주세요")
                alert(JSON.stringify(error));
            });

        }
};

index.init();