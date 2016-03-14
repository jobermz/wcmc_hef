function iniciarCapasUpload() {
	$('.upload-capas').click(uploadCapas);
}

function uploadCapas() {
	$('.upload-capas-modal').off('shown.bs.modal');
	$('.upload-capas-modal').off('hidden.bs.modal');
	$('.upload-capas-modal').on('shown.bs.modal', function (e) {
	});
	$('.upload-capas-modal').on('hidden.bs.modal', function (e) {
	});
	$('.upload-capas-modal').modal('show');
}
