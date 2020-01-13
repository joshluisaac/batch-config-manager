package templates.authentication.registration

layout 'authentication/AuthenticationMain.groovy',
        pageTitle: 'Batch Manager | Registration Page',
        withBodyClasses: 'hold-transition register-page',
        boxType: 'register-box',
        mainBody: contents {
            include unescaped: 'authentication/registration/RegistrationBody.vfm'
        }

