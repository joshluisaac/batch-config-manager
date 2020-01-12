package templates.authentication

yieldUnescaped '<!DOCTYPE html>'
html(lang: 'en') {
    head {
        meta(charset: 'utf-8')
        meta('http-equiv': "X-UA-Compatible", content:"IE=edge")
        meta(name: 'viewport', content: '"width=device-width, initial-scale=1"')
        title(pageTitle)
        link(rel: "stylesheet", href: "plugins/vendors/fontawesome-free/css/all.min.css")
        link(rel: "stylesheet", href: "plugins/vendors/ionicframework/ionicons/2.0.1/css/ionicons.min.css")
        link(rel: "stylesheet", href: "plugins/vendors/icheck-bootstrap/icheck-bootstrap.min.css")
        link(rel: "stylesheet", href: "dist/css/adminlte.min.css")
        link(rel: "stylesheet", href: "https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700")
    }
    body(class: withBodyClasses) {
        div(class: boxType){
            mainBody()
        }
        script('', type:'text/javascript',src: "plugins/vendors/jquery/jquery.min.js")
        script('', type:'text/javascript',src: "plugins/vendors/bootstrap/4_4/dist/js/bootstrap.min.js")
        script('', type:'text/javascript', src: "dist/js/adminlte.min.js")
    }
}
