package templates.modalform

yieldUnescaped '<!DOCTYPE html>'
html(lang: 'en') {
    head {
        meta(charset: 'utf-8')
        meta('http-equiv': "X-UA-Compatible", content:"IE=edge")
        meta(name: 'viewport', content: '"width=device-width, initial-scale=1"')
        link(rel: "stylesheet", href: "https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css")
        link(rel: "stylesheet", href: "plugins/vendors/bootstrap/4_4/dist/css/bootstrap.min.css")
    }
    body {
        include unescaped: 'modalform/MultiFormBody.vfm'
        script('', type:'text/javascript',src: "https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js")
        script('', type:'text/javascript',src: "https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.js")
        script('', type:'text/javascript',src: "plugins/vendors/bootstrap/4_4/dist/js/bootstrap.min.js")
        script('', type:'text/javascript', src: "dist/js/multiformData.js")
    }
}
